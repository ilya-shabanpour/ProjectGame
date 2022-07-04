package MainPanel;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class DraggableMaker
{
    public static double mouseAnchorX;
    public static double mouseAnchorY;

    public static void MakeDraggable(Node node)
    {
        node.setOnMousePressed(MouseEvent -> {
            mouseAnchorX = MouseEvent.getX();
            mouseAnchorY = MouseEvent.getY();
        });

        /* node.setOnMouseDragged(MouseEvent -> {

            if ((MouseEvent.getSceneY() - mouseAnchorY)>50 && (MouseEvent.getSceneY() - mouseAnchorY) <130) {
                node.setLayoutX((MouseEvent.getSceneX() - mouseAnchorX));
                node.setLayoutY(MouseEvent.getSceneY() - mouseAnchorY);
            }

            });
*/
        node.setOnMouseReleased(MouseEvent -> {
            if ((MouseEvent.getSceneY() - mouseAnchorY)>50 && (MouseEvent.getSceneY() - mouseAnchorY) <160 && (MouseEvent.getSceneX() - mouseAnchorX) < 80) {
                node.setLayoutX(0);
                node.setLayoutY(100);
            }
            else if ((MouseEvent.getSceneY() - mouseAnchorY)>170 && (MouseEvent.getSceneY() - mouseAnchorY) <290 && (MouseEvent.getSceneX() - mouseAnchorX) < 80) {
                node.setLayoutX(0);
                node.setLayoutY(240);
            }
            else if ((MouseEvent.getSceneY() - mouseAnchorY)>300 && (MouseEvent.getSceneY() - mouseAnchorY) <480 && (MouseEvent.getSceneX() - mouseAnchorX) < 80) {
                node.setLayoutX(0);
                node.setLayoutY(370);
            }
        });
    }
}
