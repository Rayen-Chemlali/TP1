package p3;

public class CustomArrayList {

    private Object[] ArrayList;
    private int ArraySize = 0;
    private int ArrayCapacity;

    public CustomArrayList() {
        ArrayList = new Object[10];
    }

    public CustomArrayList(int initialSize) {
        if (initialSize < 0) {
            System.out.println("Error invalid sizee");
        } else {
            ArrayList = new Object[initialSize];
        }

    }

    public void add(Object object) {

        if (ArraySize == ArrayList.length) {
            ArrayList = new Object[ArraySize * 2];
        }
        ArrayList[ArraySize] = object;
        ArraySize++;
    }

    public void add(int index, Object object)
    {
        if ((index<0)||(ArraySize<index))
        {
             System.out.println("Error: index out of range");
        }
        else
        {
            if (ArraySize == ArrayList.length)
            {
            ArrayList = new Object[ArraySize * 2];
            }
        for (int i = ArraySize; i > index; i--)
            {
            ArrayList[i] = ArrayList[i - 1];
            }

        ArrayList[index] = object;
        ArraySize++;
        }
    }
    public Object get(int index) {
        if (index < 0 || index >= ArraySize) {
            System.out.println("Error: index out of range");
        }
        else
        {
            return ArrayList[index];
        }
        return null;
    }

    public int size() {
        return ArraySize;
    }

    public boolean isEmpty() {
        return ArraySize == 0;
    }

    public boolean isIn(Object object) {
        for (int i = 0; i < ArraySize; i++)
        {
            if (ArrayList[i]==object)
            {
                return true;
            }
        }
        return false;
    }

    public int find(Object object) {
        for (int i = 0; i < ArraySize; i++)
        {
            if (ArrayList[i]==object)
            {
                return i;
            }
        }
        return -1;
    }
    public void remove(Object object) {
        int index = find(object);
        if (index != -1) {
            for(int i=index;i<ArraySize;i++)
            {
                ArrayList[i]=ArrayList[i+1];
            }
            ArraySize--;
        }
    }
    public void content()
    {
        for (int i=0;i<ArraySize;i++)
        {
            System.out.println(ArrayList[i].name);
        }
    }
}
