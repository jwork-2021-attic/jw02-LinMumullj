package _191220059.assignment3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Scene {
    public static void main(String[] args) throws IOException
    {
        Matrix matrix = new Matrix(256);
        //Line line = new Line(12);
        //put the Monster
        Monster[] monsters=Monster.creatmonsters();
        matrix.put(monsters);
        
        Queensnack theQueensnack=Queensnack.getTheQueensnack();
        Sorter sorter = new QuickSorter();

        theQueensnack.setSorter(sorter);

        String log = theQueensnack.lineUp(matrix);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();   
    }
    
}