/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.jumpingonclouds;

import java.io.IOException;

/**
 *
 * @author AbdElHalim
 */
public class JumpOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jump = -1;
        for (int i = 0; i < c.length; i++, jump++) {
            if (i < c.length-2 && c[i + 2] == 0) {
                i++;
            }
        }
        return jump;
    }

    public static void main(String[] args) throws IOException {

        int result = jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0});
        System.out.println(result);
    }
}
