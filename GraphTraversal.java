/* This code was developed by Professor Mohan to illustrate 
the working of graphs and traversal algorithms */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class GraphTraversal{
	public static int randomize(int seed, int min, int max) {
        Random random = new Random();
	    return random.nextInt((max - min) + 1) + min;
    }
	public static void displayMatrix(int[][] matrix){
		System.out.print("  ");
		for (int i =0 ; i < matrix.length; i++){
			System.out.print("|" + i + "| ");
		}
		System.out.println();
		System.out.print("  ");
		for (int i =0 ; i < matrix.length; i++){
			System.out.print(" -- ");
		}
		System.out.println();
		
		for (int i =0 ; i < matrix.length; i++){
			System.out.print(i + " ");
			for (int j =0 ; j < matrix[i].length; j++){
				System.out.print("|" + matrix[i][j] + "| ");
			}
			System.out.println();
			System.out.print("  ");
			for (int k =0 ; k < matrix.length; k++){
				System.out.print(" -- ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	public static ArrayList<Integer> dfs(int[][] matrix, int start){
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	Stack<Integer> stack = new Stack<Integer>();
    	result.add(start);
    	stack.push(start);
    	while(!stack.isEmpty()){
    		int top = stack.peek();
    		boolean flag = false;
    		/* adding unvisted neighbors */
    		ArrayList<Integer> neighbors = new ArrayList<Integer>();
    		for (int i =0; i < matrix.length; i++){
    			if (matrix[top][i] == 1 && !result.contains(i)){
    				neighbors.add(i);
    			}
    		}
    		if (neighbors.isEmpty())
    			stack.pop();
    		else{
    			/* randomly chose an unvisited neighbor */
    			int neighbor = neighbors.get(randomize(10, 0, neighbors.size()-1));
    			result.add(neighbor);
    			stack.push(neighbor);
    		}
    	}
    	return result;
    }
    public static ArrayList<Integer> bfs(int[][] matrix, int start){
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	/* add your bfs implementation here by using Queue data structure .... */
    	


    	return result;
    }
	public static void main(String[] args){
		int[][] matrix = {{0,1,0,1,0,0,0}, 
							{1,0,1,1,0,1,1},
							{0,1,0,1,1,1,0},
							{1,1,1,0,1,0,0},
							{0,0,1,1,0,0,1},
							{0,1,1,0,0,0,0},
							{0,1,0,0,1,0,0}
						};
		displayMatrix(matrix);
		ArrayList<Integer> res1 = dfs(matrix, 0);
		System.out.println("DFS:\t" + res1);
		System.out.println("-----------------------------");
		
		ArrayList<Integer> res2 = bfs(matrix, 0);
		System.out.println("BFS:\t" + res2);
		System.out.println("-----------------------------");
	}
}