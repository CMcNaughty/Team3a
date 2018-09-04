package problem;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.utils.HashMap;
import java.utils.Map;

public class Space {
    // World Space
    private Rectangle2D world;

    //Static regions
    private Map<String, StaticObstacle> static_obs;

    //Moing obstacle regions
    private Map<String, MovingObstacle> moving_obs;

    //Boxes regions
    private Map<String, MovingBox> boxes;


    public Space(double world_width, double world_height,
                 Map<String, StaticObstacle> static_obstacles,
                 Map<String, MovingObstacle> moving_obstacles,
                 Map<String, MovingBox> boxes_in {

        world = new Rectangle2D.Double(0.0, 0.0, world_width, world_height);
        static_obs = new HashMap<String, StaticObstacle>();
        moving_obs = new HashMap<String, MovingObstacle>();
        boxes = new HashMap<String, MovingBox>();

        //Check Static Obstacles
        Iterator<Rectangle2D> static_iter = static_obstacles.keySet().iterator(); //string keys - identifiers
        StaticObstacle static_zone;
        while(iter.hasNext()) {
             static_zone = static_obstacles.get(iter.next());
            if contains_rect(world, static_zone.getRect()) {
                static_obs.add(static_zone);
            }
            else {
                throw IllegalArguementException('at least one static_obstacle given was out of bounds')
            }
        }
        //Check Movable Obstacles
        Iterator<Rectangle2D> moving_iter = moving_obstacles.keySet().iterator(); //string keys - identifiers
        StaticObstacle moving_zone;
        while(iter.hasNext()) {
            moving_zone = movinig_obstacles.get(iter.next());
            if contains_rect(world, moving_zone.getRect()) {
                static_obs.add(moving_zone);
            }
            else {
                throw IllegalArguementException('at least one movable_obstacle given was out of bounds')
            }
        }
        //Check Movable Boxes
        Iterator<Rectangle2D> box_iter = boxes_in.keySet().iterator(); //string keys - identifiers
        StaticObstacle box_zone;
        while(iter.hasNext()) {
            box_zone = boxes_in.get(iter.next());
            if contains_rect(world, box_zone.getRect()) {
                static_obs.add(box_zone);
            }
            else {
                throw IllegalArguementException('at least one movable_box given was out of bounds')
            }
        }
    }
    /*
     * Checks to see if small fits inside large
     *
     * @param large
     *              the larger rectangle to chekc if small fits inside
     * @param small
     *              the smaller rectangle
     *
     * @return
     *          true if the smaller rectange fits completely within the larger rectange
     */
    private boolean contains_rect(Rectangle2D large, Rectangle2D small) {
        // To add - only chek to see if within large
        return true
    }

    /*
     * Checks to see if given rectangle, rect, fits within world and is collision-free with other objects
     *
     * @param rect
     *              the rectangle to chek for validity
     *
     * @return
     *          true if rect fits completely within world AND that it doesn't intersect other objects
     */
    public boolean valid_placement(Rectangle2D rect) {
        // To add
        return true
    }
}