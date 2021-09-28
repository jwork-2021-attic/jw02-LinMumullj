package _191220059.assignment3;

public class ShellSorter implements Sorter{
    
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }
    private String plan = "";
    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }
    @Override
    public void sort(){
        //增量gap，并逐步缩小增量
    for(int gap=a.length/2;gap>0;gap/=2){
        //从第gap个元素，逐个对其所在组进行直接插入排序操作
        for(int i=gap;i<a.length;i++){
            int j = i;
            while(j-gap>=0 && a[j]<a[j-gap]){
                //插入排序采用交换法
                swap(j,j-gap);
                j-=gap;
            }
        }
    }
    }


        @Override
        public String getPlan() {
            return this.plan;
        }
}