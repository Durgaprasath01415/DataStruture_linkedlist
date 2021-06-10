public interface INode<E>{
    void setData(E data);
        E getData();
        void setNext(INode next);
        INode getNext();

    }