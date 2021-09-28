package _191220059.assignment3;


public class QuickSorter implements Sorter {

    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        Quicksort(0,a.length-1);
    }
    private void Quicksort(int l,int r)
    {
        if(l>=r)
            return;
        int p=partition(l, r);
        Quicksort(l, p-1);
        Quicksort(p+1, r);
    }
    private int partition(int l,int r)
    {
        int pivot=a[l];
        int pre=l;
        int lat=r;
        while(true)
        {
            while(a[lat]>pivot)
            {
                lat--;
            }
            while(a[pre]<pivot)
            {
                pre++;
            }
            if(pre<lat)
                swap(pre,lat);
            else
            {
                return lat;
            }
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
