/**
 * simple buffer manager that distributes the buffers equally among all the join operators
 **/

package qp.optimizer;

public class BufferManager {

    public static int numBuffer;
    static int numJoin;

    static int buffPerJoin;

    public BufferManager(int numBuffer, int numJoin) {
        this.numBuffer = numBuffer;
        this.numJoin = numJoin;

        this.buffPerJoin = 0;
        if (numJoin > 0){
            buffPerJoin = numBuffer / numJoin;
        }
    }

    public static int getBuffersPerJoin() {
        return buffPerJoin;
    }
    public static void setNumBuffer (int numBuffers){
        numBuffer =  numBuffers;
    }

}
