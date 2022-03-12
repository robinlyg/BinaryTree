package com.company;
public class BinaryTree <E extends Comparable<E>>
{

    private Node<E> mRoot;

    public BinaryTree ()
    {
        mRoot = null;
    }

    public void clear()
    {
        mRoot = null;
        //perfor garbage collection
        //reclaims any object without a reference in RAM
        System.gc();
    }
    @Override
    public String toString()
    {
        // nodes in "correct" order smallest to largest
        //start at the root
        return "[" + toStringRecursive(mRoot) + "]";

    }

    private String toStringRecursive(Node<E> current)
    {
        //base case
        if(current == null)
            return "";
            //recursive
        else
            return toStringRecursive(current.mLeft) + " " + current.mData + toStringRecursive(current.mRight);
        //recursive case
        //move left
        //concatenate mData
        //moveRight
    }
    public boolean add(E element)
    {
        //assign mRoot here because our first add will ALWAYS be the mRoot
        //gets set to itself again
        mRoot = addRecursive(mRoot, element);
        //will always return true
        return true;
    }
    private Node<E> addRecursive(Node<E> current, E element)
    {
        //base case
        if(current == null)
            return new Node<E>(element);
            //start at right

            //if less than mroot move left when hit null add new node which is a leaf

            //if element < current.mData move left
        else if (element.compareTo(current.mData) < 0)
            current.mLeft = addRecursive(current.mLeft, element);

            //if greater than mroot move to right when hit null add new node which is a leaf

            //else element > current.mData move right
        else if (element.compareTo(current.mData) > 0)
            current.mRight=  addRecursive(current.mRight, element);

        //ignore == no dupes allowed
        return current;


    }

    //**************inner class*******************
    private class Node<E>
    {
        Node<E> mLeft;
        Node<E> mRight;
        E mData;

        //2 constructors
        public Node(E data, Node<E> left, Node<E>right)
        {
            mData = data;
            mLeft = left;
            mRight = right;
        }

        public Node(E data)
        {
            this(data, null, null);

        }

        //if node is leave?
        public boolean isLeaf()
        {
            return mLeft == null && mRight == null;
        }

    }
}
