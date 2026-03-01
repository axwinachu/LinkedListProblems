public class Maze {
    static void maze(String way,int r,int c){
      if(r==3 && c==3){
        System.out.println(way);
      }
      if(r<4&&c<4){
        maze(way+"H", r+1, c+1);
      }
      if(r<4){
        maze(way+"R", r+1, c);
      }
      if(c<4){
        maze(way+"d", r, c+1);
      }
    }
    public static void main(String[] args) {
        maze("", 1, 1);
    }
}
