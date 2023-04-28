import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0, 0);
    //<> is generic that defines what array holds
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();
    private Player player;

    public void load_tiles() {
        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row);
            }
            f.close();
            //using split to look for \t = it is meta character for tabs.
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            //Counter control loop
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }
        } catch (Exception e) {
            //Going to catch an error
            e.printStackTrace();
        }
    }


    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;

        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length) && _world[x][y] != null) {
            switch (_world[x][y]){
                case "StartingRoom":
                    mt = new StartingRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureCave":
                    mt = new TreasureCave(x,y, new Gold(5));
                    mt = checkRoomExists(mt);
                    break;
                case "ZombieCave":
                    mt = new ZombieCave(x, y, new Zombie("Slow Zombie", 20, 10, 5));
                    mt = checkRoomExists(mt);
                    break;
                case "SkeletonCave":
                    mt = new SkeletonCave(x, y, new Skeleton("Big Skeleton", 40, 10, "Bow shoots with three arrows at a time."));
                    mt = checkRoomExists(mt);
                    break;
                case "OgreCave":
                    mt = new OgreCave(x, y, new Ogre("Green Ogre", 30, 10, "Color is green"));
                    mt = checkRoomExists(mt);
                    break;
                case "GiantSpiderCave":
                    mt = new GiantSpiderCave(x, y, new GiantSpider("Venomous Giant Spider", 40, 15, "Venom consist at least 40 different toxic proteins"));
                    mt = checkRoomExists(mt);
                    break;
                case "CyclopsCave":
                    mt = new CyclopsCave(x, y, new Cyclope("Scary Cyclope", 35, 20, "It has giant blue eye"));
                    mt = checkRoomExists(mt);
                    break;
                case "BoatCave":
                    mt = new BoatCave(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "StoneSwordCave":
                    mt = new StoneSwordCave(x, y, new StoneSword());
                    mt = checkRoomExists(mt);
                case "HumanSkinCave":
                    mt = new HumanSkinCave(x, y);
                    mt = checkRoomExists(mt);
                case "IronSwordCave":
                    mt = new IronSwordCave(x, y, new IronSword());
                    mt = checkRoomExists(mt);
                case "EmptyCavePath":
                    mt = new EmptyCavePath(x, y);
                    mt = checkRoomExists(mt);
                case "Doggy":
                    mt = new DoggyCave(x, y, new Item("Doggy", "A nice dog that was left here.", 100));
                    mt = checkRoomExists(mt);
            }
        }
        return mt;
    }
    public static MapTile checkRoomExists(MapTile mt){
        if (history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }
        else {
            history.add(mt);
        }
        return mt;
    }
}
