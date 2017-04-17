
/**
 * Interface to implement a Changeable type of action - either undo or redo.
 *
 */

public interface Changeable {

 /**
  * Undo an action
  */

 public void undo();
 /**
  * Redo an action
  */

 public void redo();

}
