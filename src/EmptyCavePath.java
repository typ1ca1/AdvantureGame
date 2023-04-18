public class EmptyCavePath extends MapTile{

    public EmptyCavePath(int x, int y){
        super(x, y);
    }

    public String intro_text(){
        return "\n You found an empty cave. Looks like it's a path to some other places.";
    }
}
