package _191220059.assignment3;
import _191220059.assignment3.Matrix.Position;
import java.util.Random;
public class Monster implements Linable{
    private int r;
    private int g;
    private int b;

    public static Monster monsters[]=new Monster[256];
    //public static Monster monsters[]=new Monster[12];
    private int myrank;
    private Position position;

    Monster(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void setMonster(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }
/*
    public static Monster[] creatmonsters()
    {
        Random rd=new Random();
        Random rr=new Random();
        Random rg=new Random();
        Random rb=new Random();
        for(int i=0;i<12;i++)
        {
            int R = rr.nextInt(256);//生成随机数
            int G = rg.nextInt(256);//生成随机数
            int B = rb.nextInt(256);//生成随机数
            monsters[i]=new Monster(R,G,B);
            monsters[i].myrank=i+1;
        }
        for(int i=0;i<12;i++)
        {
            int j = rd.nextInt(12);//生成随机数
            Monster tmp=monsters[i];
            monsters[i]=monsters[j];
            monsters[j]=tmp;
        }
        return monsters;
    }
    */
    
    public static Monster[] creatmonsters()
    {
        Random rd=new Random();
        int R=255;
        int G=0;
        int B=0;

        for(int i=0;i<256;i++)
        {
            // int R = rr.nextInt(256);//生成随机数
            // int G = rg.nextInt(256);//生成随机数
            // int B = rb.nextInt(256);//生成随机数
            G=i;
            monsters[i]=new Monster(R,G,B);
            monsters[i].myrank=i;
        }
        for(int i=0;i<256;i++)
        {
            int j = rd.nextInt(256);//生成随机数
            Monster tmp=monsters[i];
            monsters[i]=monsters[j];
            monsters[j]=tmp;
        }
        return monsters;
    }
    
    public static Monster getMonsterByRank(int rank) {

        for (Monster monster : Monster.monsters) {
            if (monster.myrank == rank) {
                return monster;
            }
        }
        return null;

    }

    public void setRank(int rk) {
        myrank=rk;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.myrank + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.myrank;
    }
}