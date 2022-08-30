package restaurant;

import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date lastUpdated;
    private HashMap menuItems;
    private HashMap oldMenuItems;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public HashMap getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap menuItems) {
        this.menuItems = menuItems;
    }

    public HashMap getOldMenuItems() {
        return oldMenuItems;
    }

    public void setOldMenuItems(HashMap oldMenuItems) {
        this.oldMenuItems = oldMenuItems;
    }
}
