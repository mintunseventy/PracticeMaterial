package UnitedHealthCare;

public class CustomHM<K,V> {

    private Entry<K, V> table[];
    private int capacity;

    static class Entry<K,V>
    {
        K key;
        V value;
        Entry<K,V> next;
        Entry(K key,V value,Entry<K,V> next)
        {
            this.key=key;
            this.value=value;
            this.next=next;
        }

    }

    @SuppressWarnings("unchecked")
    public CustomHM(int capacity) {
        this.capacity=capacity;
        table=new Entry[this.capacity];
    }

    private int hash(K k)
    {
        return Math.abs(k.hashCode())%capacity;
    }

    void put(K key,V value)
    {
        if(key==null)
            return;
        Entry<K,V> newEntry=new Entry<K,V>(key, value, null);

        int hash=hash(key);
        if(null==table[hash])
        {
            table[hash]=newEntry;
        }else
        {
            Entry<K, V> prev=null;
            Entry<K, V> curr=table[hash];
            //capacity++;
            while(curr!=null)
            {
                if(curr.key.equals(key))
                {
                    if(prev==null)
                    {
                        newEntry.next=curr.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else
                    {
                        newEntry.next=curr.next;
                        prev.next=newEntry;
                        return;
                    }
                }
                prev=curr;
                curr=curr.next;
            }
            prev.next=newEntry;
        }
    }

    void display(){

        for(int i=0;i<capacity;i++)
        {

            if(null!=table[i])
            {
                Entry<K, V> curr=table[i];
                while(curr!=null)
                {
                    System.out.println("Key :"+curr.key+"Value :"+curr.value);
                    curr=curr.next;
                }
            }
        }
    }

}
