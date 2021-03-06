package ProblemStatements;

public class Test {

	public static void main(String[] args) {
	
		ArraysStrings.testCatch();
		
		/*
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.insert(7);
		bst.insert(2);
		bst.insert(9);
		bst.insert(3);
		bst.insert(8);
		bst.insert(0);
		bst.insert(1);
		bst.insert(6);;
		bst.insert(5);;
		bst.preorder(bst.getRoot() );
		System.out.println(bst.maxDepth1(bst.getRoot()));
		System.out.println(bst.maxDepth(bst.getRoot()));
		/*
		TreeNode<Integer> res = bst.commonAnce(8,11);
		TreeNode<Integer> res1 = bst.commonAncestor(6, 11);
		System.out.println(res.data);
		System.out.println(res1.data);
		/*
		Integer[] data = {9,8,7,6,5,4,3,2,1};
		TreeProblems<Integer> tp = new TreeProblems<>();
		BinarySearchTree<Integer> res = tp.createBST(data);
		System.out.println();
				
		res.inorder(res.getRoot());
		System.out.println();
		bst.printAllLeafNodePaths();
		System.out.println();
		bst.printPath(0);
		TreeNode<Integer> res = bst.search(7);
		System.out.println();
		bst.preorder(bst.getRoot());
		System.out.println();
		bst.inorder(bst.getRoot());
		System.out.println();
		bst.postorder(bst.getRoot());
		System.out.println();
		System.out.println(bst.count(bst.getRoot()));
		System.out.println(bst.hight(bst.getRoot()));
		bst.BFS();
		System.out.println();
		bst.levelOrderPrint(4);
		System.out.println();
		TreeNode<Integer> res1 = bst.minNode(bst.getRoot());
		System.out.println(res1.data);
		TreeNode<Integer> res2 = bst.getParent(bst.getRoot(), 5);		
		System.out.println(res2);
		bst.BFS();
		System.out.println();
		bst.levelOrderPrint(4);
		System.out.println();
		System.out.println(bst.minDepth(bst.getRoot()));
		System.out.println(bst.isTreeBalanced());
		System.out.println(bst.maxDepth(bst.getRoot()));
		System.out.println(bst.hight(bst.getRoot()));
		System.out.println(bst.minDepth(bst.getRoot()));
		TreeNode<Integer> res3 = bst.commonAncestor(5, 1);	
		System.out.println(bst.distance(5, 1));
		/*
		StackProblem<Integer> sp = new StackProblem<>();
		MyStack<Integer> ms=new MyStack<Integer>(5);
		ms.push(1);
		ms.push(6);
		ms.push(2);
		ms.push(4);
		ms.push(3);
		MyStack<Integer> rs = sp.sortStack(ms);
		System.out.println();
		/*
		StackTwoQueue<Integer> stq = new StackTwoQueue<>();
		stq.push(1);
		stq.push(2);
		stq.push(3);		
		System.out.println("Count -"+stq.count());
		System.out.println(stq.pop());
		System.out.println(stq.pop());
		stq.push(4);
		stq.push(5);
		stq.push(6);
		stq.push(7);
		stq.push(8);
		System.out.println("Count -"+stq.count());
		System.out.println(stq.pop());
		System.out.println(stq.pop());
		System.out.println(stq.pop());
		System.out.println("Count -"+stq.count());
		System.out.println(stq.pop());
		System.out.println(stq.pop());
		System.out.println("Count -"+stq.count());
		
	/*
	//SetOfStacks<Integer> sos = new SetOfStacks<Integer>();
	QueueTwoStacks<Integer> mq=  new QueueTwoStacks<>();
	mq.enqueue(1);
	mq.enqueue(2);
	mq.enqueue(3);
	mq.enqueue(4);
	mq.enqueue(5);
	mq.enqueue(6);
	mq.enqueue(7);
	mq.enqueue(8);
	System.out.println(mq.count());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.count());
	mq.enqueue(6);
	mq.enqueue(7);
	mq.enqueue(8);
	System.out.println(mq.count());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.count());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.dequeue());
	System.out.println(mq.count());
	/*
	sos.push(1);
	sos.push(2);
	sos.push(3);
	sos.push(4);
	sos.push(5);
	sos.push(6);
	sos.push(7);
	//System.out.println("Pop - "+ sos.pop());
	System.out.println("Pop - "+ sos.popAt(0));
	System.out.println("Pop - "+ sos.pop());
	System.out.println("Pop - "+ sos.pop());
	/*
		QueueLinkedList<Integer> mq= new QueueLinkedList<>();
		//MyQueue<Integer> mq=  new MyQueue<>(5);
		//MyCircularQueue<Integer> mq= new MyCircularQueue<>(5);
		System.out.println("count - "+ mq.count());
		mq.enque(1);
		mq.enque(2);
		mq.enque(3);
		mq.enque(4);
		mq.enque(5);
		mq.enque(6);
		System.out.println("count - "+ mq.count());
		mq.displayQueue();
		System.out.println(mq.dequeue());
		System.out.println("count - "+ mq.count());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println("count - "+ mq.count());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println("count - "+ mq.count());
		mq.enque(1);
		mq.enque(2);
		mq.enque(3);
		mq.enque(4);
		mq.enque(5);
		mq.enque(6);
		System.out.println("count - "+ mq.count());
		mq.displayQueue();
	
	MinStack<Integer> ms = new MinStack<Integer>();
	//ThreeStacks<Integer> ms = new ThreeStacks<>();
	//MyStack<Integer> ms=new MyStack<Integer>(5);
	ms.Push(4);
	ms.Push(5);
	ms.Push(6);
	ms.Push(3);
	ms.Push(1);
	ms.Push(5);
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	ms.Pop();
	System.out.println(ms.Min());
	/*
	ms.push(1,34);
	ms.push(2,4);
	ms.push(1,5);
	ms.push(1,6);
	ms.push(1,7);
	ms.push(1,8);	
	ms.push(1,9);
	System.out.println(ms.peek(1));
	System.out.println(ms.peek(0));
	System.out.println(ms.peek(2));
	System.out.println(ms.count(1));
	System.out.println(ms.count(0));
	System.out.println(ms.count(2));
	ms.displayStack(0);
	ms.displayStack(1);
	ms.displayStack(2);
	ms.pop(1);
	ms.pop(1);
	ms.pop(1);
	ms.pop(1);
	ms.pop(1);
	ms.pop(1);
	ms.pop(0);
	System.out.println(ms.peek(1));
	System.out.println(ms.peek(0));
	System.out.println(ms.count(1));
	System.out.println(ms.count(0));
	System.out.println(ms.count(2));
	/*
	System.out.println(ms.getPeek());
	System.out.println(ms.count());
	ms.displayStack();	
	ms.push(4);
	System.out.println(ms.count());
	ms.displayStack();
	System.out.println(ms.getPeek());
	/*
	LinkedList<Integer> mlLinkedList = new LinkedList<Integer>();
	mlLinkedList.addNode(3);
	mlLinkedList.addNode(1);
	mlLinkedList.addNode(5);
	mlLinkedList.addNode(5);
	//mlLinkedList.addNode(1);
	mlLinkedList.addNode(3);
	mlLinkedList.displayList();
	System.out.println();
	boolean res = mlLinkedList.isPalindrome();
	mlLinkedList.displayList();
	System.out.println();
	/*
	mlLinkedList.addNode(12);
	mlLinkedList.addNode(13);
	mlLinkedList.addNode(62);
	mlLinkedList.addNode(27);
	mlLinkedList.addNode(12);
	mlLinkedList.addNode(45);
	mlLinkedList.addNode(new ListNode<Integer>(54));
	//mlLinkedList.addNodeAt(76, 2);
	//mlLinkedList.getNode(10).next = mlLinkedList.getNode(4);
	//mlLinkedList.displayList();
	System.out.println();
	//System.out.println(mlLinkedList.count());
	//ListNode<Integer> res1 = mlLinkedList.getNode(2);
	//mlLinkedList.deleteNodeAt(2);
	//mlLinkedList.displayList();
	//System.out.println();
	//ListNode<Integer> res = mlLinkedList.getNode(2);	
	//ListNode<Integer> rgd = mlLinkedList.reverseList_recur(mlLinkedList.getHead());
	//ListNode<Integer> res11 =mlLinkedList.reversePartOfList(mlLinkedList.getHead(),3);
	//LinkedList<Integer> res= mlLinkedList.addTwoLists(mlLinkedList,mlLinkedList1);	
	//mlLinkedList.displayList();
	ListNode<Integer> res = mlLinkedList.startOfLoop();
	System.out.println();
//	System.out.println(mlLinkedList.count());
	
	
	/*Sorting	 
	Integer[] arr = {7, 5, 2, 4, 3,9};
	Sorting.quickSort(arr);
	for(int ii=0;ii<arr.length;ii++)
		System.out.print(arr[ii]+ ", ");
	
	char[][] data ={{'S','S','S'},{'A','A','A'},{'V','V','V'}};
	for(int i=0;i<data[0].length;i++){
		for(int j=0;j<data[1].length;j++){
			System.out.print(data[i][j]+", ");			
		}
		System.out.println();
	}	
	
	char[][] res1 = ArraysStrings.rotateMatrix(data);	
	System.out.println();
	for(int i=0;i<res1[0].length;i++){
		for(int j=0;j<res1[1].length;j++){
			System.out.print(res1[i][j]+", ");			
		}
		System.out.println();
	}	
	
	res1 = ArraysStrings.rotateMatrix(res1);	
	System.out.println();
	for(int i=0;i<res1[0].length;i++){
		for(int j=0;j<res1[1].length;j++){
			System.out.print(res1[i][j]+", ");			
		}
		System.out.println();
	}	
	
	//replace space in string
	System.out.println(ArraysStrings.replaceSpace(" Avi jit "));	
	System.out.println(ArraysStrings.replaceSpace_array(" Avi jit "));
	
	//Anagram strings
	System.out.println(ArraysStrings.isStringAnagram_sort("Shweta","Shweta"));
		
	//Remove duplicates
	System.out.println(ArraysStrings.removeDuplicate_array("Avijit"));
	System.out.println(ArraysStrings.removeDuplicate_LHS("Avijit"));
	
	
	//Reverse String
	System.out.println(ArraysStrings.reverseString("abcd"));
	System.out.println(ArraysStrings.reverseString_SB("abcd"));
	
	//Unique chars string
	System.out.println(ArraysStrings.areUniqueChars_256("AVIJTGBa"));
	System.out.println(ArraysStrings.areUniqueChars_bit("AbaB"));
	System.out.println(ArraysStrings.areUniqueChars_sorting("AbaB"));
	*/
	
	
	}

}
