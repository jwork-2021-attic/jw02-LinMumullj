package _191220059.assignment3;

public class Matrix {
    public Matrix(int length) {
        this.positions = new Position[length];
    }

    private Position[] positions;

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }
    public void put(Linable[] linable) {
        for(int j=0;j<linable.length;j++)
        {
            if (this.positions[j] == null) {
                this.positions[j] = new Position(null);
            }
            this.positions[j].setLinable(linable[j]);
        }
        
    }
    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    class Position {

        private Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        String lineString = "";
        for (int i = 0; i < positions.length; i++) {
            lineString+=(positions[i].linable.toString());
            if (i % 16 == 0 && i != 0) {
                lineString+=("\n");
            }
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }
        return linables;
    }
}