/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Comparator;

/**
 *
 * @author WildW
 */
public class OwnerCompara implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getOwner().compareToIgnoreCase(o2.getOwner());
    }

}
