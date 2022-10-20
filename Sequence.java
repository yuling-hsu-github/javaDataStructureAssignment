package dataStructureWeek3;

import java.util.Scanner;
public class Sequence<E> {
    protected Object[] data;
    protected int size;

    public Sequence(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();}
        this.data=new Object[n];
        this.size=0;
    }

    public int size(){
        return this.size;
    }

    public void append(E element){            
        if(this.size<this.data.length){
            this.data[this.size]=element;
        }
        else{
            Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
            this.data[this.size]=element;
        }
        this.size++;    
    }

    public Object get(int k) throws IndexOutOfBoundsException{
            if(k<0 || k>=this.size){
                throw new IndexOutOfBoundsException();}
            return this.data[k];
    }

	public void print(){
		System.out.print("\nCurrent Sequence: ");
		for(int i=0;i<this.size();i++){
            System.out.print(this.get(i)+" ");
        }
		System.out.println();
	}
	//INSERT insert mean the rest of elements will move back
    public void insert(int index, E newElement){
        //IMPLEMENT ME

    	Object[] temp=new Object[this.size+1];
    	System.arraycopy(this.data, 0, temp, 0,index);
        System.arraycopy(this.data, index, temp, index+1, this.size-index);
        this.data = temp;
        this.data[index] = newElement;
        this.size++;
    }



    public void delete(int index) {
        if (this.data.length < index || index < 0) {
            System.out.println("Index Out Of Bounds, please input an index value less than " + this.size);
        } else {
            Object[] temp = new Object[this.size - 1];
            System.arraycopy(this.data, 0, temp, 0, index);
            System.arraycopy(this.data, index, temp, index - 1, this.size - index);
            this.data = temp;
            this.size--;
        }
    }
public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		Sequence<Integer> s = new Sequence<Integer>(5);
		s.append(1);
		s.append(2);
		s.append(3);
		s.append(4);
		s.append(5);
		s.print();

    int choice =0;
while (choice != 3) {

            System.out.println("Please enter 1 to insert, 2 to delete and 3 to quit");
            choice = in.nextInt();

            if (choice == 1) {
                //INSERT FUNC
                System.out.println("Please input the value to insert");
                int AddValue = in.nextInt();

                System.out.println("Please input the index to insert");
                int AddIndexValue = in.nextInt();
                s.insert(AddIndexValue, AddValue);
                s.print();

            } else if (choice == 2) {
                //DELETE FUNC
                System.out.println("Please input the index to delete");

                int DeletedIndexValue = in.nextInt();
                s.delete(DeletedIndexValue);
                s.print();
                //System.out.println("Size is :" + s.size);
                //System.out.println("data length is :" + s.data.length);

            } else {
                System.out.println("Invalid Choice");
            }

        }

        System.out.println("User enter 3, goodbye");

    }   //End main

}
