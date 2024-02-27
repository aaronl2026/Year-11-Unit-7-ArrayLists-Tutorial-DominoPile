import java.util.ArrayList;
public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for(int top = 0; top <= 6; top++){
            for(int bottom = top; bottom <= 6; bottom++){
                Domino domino = new Domino(top, bottom);
                pile.add(domino);
            }
        }
    }
    public void shuffle(){
        for(int i = 1; i < pile.size(); i++){
            Domino firstUnit = pile.get(i-1);
            Domino secondUnit = pile.get(i);
            pile.set(i-1, secondUnit);
            pile.set(i, firstUnit);
        }
    }
}
