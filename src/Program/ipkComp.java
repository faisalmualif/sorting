/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Comparator;

public class ipkComp implements Comparator<set_get> {
    @Override
    public int compare(set_get a, set_get b) {
        return Float.compare(a.getIpk(), b.getIpk());
    }
}
 

