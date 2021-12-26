import java.lang.*;
import java.util.*;
class SearchAlgo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int size = 10;
		int arr[] = new int[size];
		
		fillArray(arr, size);
		for(int i = 0; i < size; i++)
			System.out.println(arr[i]);
		
		System.out.println("\n======================================================================");
		System.out.println("\n===============Find Min and Max in array==================");
		long start = System.currentTimeMillis();
		System.out.println("start time in (ms) = " + start);
		
		int minMax[] = new int[2];
		findMinMax(arr, size, minMax);
		
		long end = System.currentTimeMillis();
		System.out.println("end time in (ms) = " + end);
		System.out.println("The Search time (in ms) = " + (end - start));
		System.out.println("min = " + minMax[0]);
		System.out.println("max = " + minMax[1]);
		
		
		System.out.println("\n======================================================================");
		System.out.println("\n===============The Array after sorting==================");
		
		start = System.currentTimeMillis();
		System.out.println("start time in (ms) = " + start);
		
		mergeSort(arr, size);//takes 5 milliseconds
		//Arrays.sort(arr);//takes 7 milliseconds
		for(int i = 0; i < size; i++)
			System.out.println(arr[i]);
		
		end = System.currentTimeMillis();
		System.out.println("end time in (ms) = " + end);
		System.out.println("The Sorting time (in ms) = " + (end - start));

		
		System.out.println("\n======================================================================");
		System.out.println("\n===============Binary Seach using Divide and conquer==================\n");
		
		int startElement = 0, endElement = size - 1;
		
		System.out.print("Please enter a the number you want to search for : ");
		int searchNum = input.nextInt();
		System.out.println();
		
		//int searchNum = Integer.parseInt(args[0]);
		start = System.currentTimeMillis();
		System.out.println("start time in (ms) = " + start);
		
		int binSearch = binarySearch(arr, searchNum, startElement, endElement);
		//int binSearch = binarySearchIterative(arr, searchNum, size);
		
		end = System.currentTimeMillis();
		System.out.println("end time in (ms) = " + end);
		System.out.println("The Search time (in ms) = " + (end - start));

		if(binSearch == -1)
			System.out.println("This number is Not Found!!");
		else
			System.out.println("the number at index = " + binSearch + " and its value is = " + arr[binSearch]);

	 
	}
	
	static void fillArray(int arr[], int size){
		Random random = new Random();
		for(int i = 0; i < size; i++)
			arr[i] = random.nextInt(100);
	}
	
	static void findMinMax(int arr[], int size, int minMax[]){
		//with system out takes 34 milliseconds
		//without system out takes 27 milliseconds
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < size; i++){
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		minMax[0] = min;
		minMax[1] = max;
	}
	
	static int binarySearch(int arr[], int searchNum, int startElement, int endElement){
		//takes 0 milliseconds
		if(startElement > endElement)//base case O(1)
			return -1;
		
		int mid = (startElement + endElement) / 2;//O(1)
		
		if(searchNum == arr[mid])//divide
			return mid;
		else if(searchNum > arr[mid])//divide
			return binarySearch(arr, searchNum, mid + 1, endElement);//conquer
		else//divide
			return binarySearch(arr, searchNum, startElement, mid - 1);//conquer
		
		//the combine here is trivial
		/*
			T(N) = T(N/2) + O(1)
			using Master Case
				1 vs N^log 1 base 2
				1 vs N^0
				1 vs 1
				->case 2: theta(1 * log N)
				<<<<<<<<<<<<<<<<<<<<<<so -> log 10 = 1<<<<<<<<<<<<<<<<<<<<<<
				
				
		*/
	}
	
	static int binarySearchIterative(int arr[], int searchNum, int size){
		//takes 3 milliseconds
		int startElement = 0, endElement = size - 1; //O(1)
		while(startElement <= endElement){ //#iterations * O(B)
			int mid = (startElement + endElement) / 2;//O(1)
			
			if(searchNum == arr[mid])//O(1)
				return mid;
			else if(searchNum > arr[mid])//O(1)
				startElement = mid + 1;
			else//O(1)
				endElement = mid - 1;
		}
		/*
			#iterations: loop until reach 1
			(1) N/2 -> N/2^1
			(2) N/4 -> N/2^2
			-
			-
			-
			(L) 1 -> N/2^L
			----------------
			N/2^L = 1 -> N = 2^L
			log N base 2 = L log 2 base 2
			log N base 2 = L
			------------------
			#iterations * O(B)
			log N base 2 * O(1)
			O(log N base 2)
			<<<<<<<<<<<<<<<<<<<<<<so -> log 10 base 2 = 3<<<<<<<<<<<<<<<<<<<<<<
			
		*/
		return -1;
	}
	
	static void merge(int arr[], int leftArr[], int rightArr[], int leftSize, int rightSize){
		int i = 0, left = 0, right = 0;
		
		while(left < leftSize && right < rightSize){
			if(leftArr[left] < rightArr[right]){
				arr[i] = leftArr[left];
				left++;
			}
			else{
				arr[i] = rightArr[right];
				right++;
			}
			i++;
		}
		
		while(left < leftSize){
			arr[i] = leftArr[left];
			left++;
			i++;
		}
		
		while(right < rightSize){
			arr[i] = rightArr[right];
			right++;
			i++;
		}
		
		
	}
	
	static void mergeSort(int arr[], int size){
		if(size < 2)//base case O(1)
			return;
		
		int mid = size / 2, j = 0;
		
		int leftArr[] = new int[mid];
		int rightArr[] = new int[size - mid];
		
		for(int i = 0; i < size; i++){//divide O(N)
			if(i < mid)
				leftArr[i] = arr[i];
			else
			{
				rightArr[j] = arr[i];
				j++;
			}
		}
		
		mergeSort(leftArr, mid);//conquer
		mergeSort(rightArr, size - mid);//conquer
		merge(arr, leftArr, rightArr, mid, size - mid);//combine O(N)
		
		/*
			T(N) = 2T(N/2) + O(N)
			using Master Case
				N vs N^log 2 base 2
				N vs N
				N vs N
				->case 2: theta(N * log N)
		*/

	}
}