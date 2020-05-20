/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * class Administrator: who Approve_playgrounds by check validation of the
 * location
 *
 * @author EGYPT_LAPTOP
 */
public class Administrator {

    private Playground_owner[] playgrounds;
/**
 * class Administrator: who Approve_playgrounds by check validation of the
 * location
 *@param obj1 type playground_details to do validation
 * @author EGYPT_LAPTOP
 * @return True if the validation success else return false
 */
    public boolean Approve_playgrounds(playground_details obj1) {

        for (int i = 0; i < obj1.playground_location.length(); i++) { // checks whether the character is neither a letter nor a digit
            // if it is neither a letter nor a digit then it will return false
            if (obj1.playground_location.charAt(i) == ' ') {
                continue;
            }
            if (Character.isLetterOrDigit(obj1.playground_location.charAt(i)) == false) {
                return false;
            }

        }

        return true;

    }

    /**
     * to suspend the playground
     * @param play_ground type playground_details
     * @author EGYPT_LAPTOP
     */
    public void suspend_playground(playground_details play_ground) {
		// TODO - implement Administrator.suspend_playground

    }

    /**
     *to delete the playground
     * @param play_ground type playground_details
      * @author EGYPT_LAPTOP
     */
    public void delete_playground(playground_details play_ground) {
        // TODO - implement Administrator.delete_playground
    }

    /**
     * to activate the playground
     * @param play_ground type playground_details
      * @author EGYPT_LAPTOP
     */
    public void activate_playground(playground_details play_ground) {
		// TODO - implement Administrator.activate_playground

    }

}
