public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return (top+"/"+bottom);
    }
    public void flip(){
        int newTop = bottom;
        int newBottom = top;
        top = newTop;
        bottom = newBottom;
    }
    public void settle(){
        if(top>bottom) flip();
    }
    public int compareTo(Domino other){
        int thisSmallestValue = 0;
        int thisLargestValue = 0;
        int otherSmallestValue = 0;
        int otherLargestValue = 0;
        if(top>bottom){
            thisSmallestValue = bottom;
            thisLargestValue = top;
        }
        else if(bottom>top){
            thisSmallestValue = top;
            thisLargestValue = bottom;
        }
        if(other.top>other.bottom){
            otherSmallestValue = other.bottom;
            otherLargestValue = other.top;
        }
        else if(other.bottom>other.top){
            otherSmallestValue = other.top;
            otherLargestValue = other.bottom;
        }
        if (thisSmallestValue < otherSmallestValue){
            return -1;
        }
        else if (thisSmallestValue > otherSmallestValue){
            return 1;
        }
        else if (thisSmallestValue == otherSmallestValue){
            if (thisLargestValue < otherLargestValue){
                return -1;
            }
            else if (thisLargestValue > otherLargestValue){
                return 1;
            }
            else if (thisLargestValue == otherLargestValue){
                return 0;
            }
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        int thisTotal = top+bottom;
        int otherTotal = other.top+other.bottom;
        if(thisTotal < otherTotal) return -1;
        if(thisTotal > otherTotal) return 1;
        if(thisTotal == otherTotal) return 0;
        return 0;
    }
    public boolean canConnect(Domino other){
        if(this.top == other.top) return true;
        if(this.top == other.bottom) return true;
        if(this.bottom == other.top) return true;
        if(this.bottom == other.bottom) return true;
        return false;
    }
}
