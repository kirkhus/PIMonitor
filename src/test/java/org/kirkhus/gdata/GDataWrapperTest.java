package org.kirkhus.gdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by kirkhus on 13.07.2017.
 */
public class GDataWrapperTest {


    @Test
    public void testConnectionToGoogle() {
        final GDataWrapper wrapper = GDataWrapper.getInstance();
        assertTrue(wrapper.isConnected());

    }


}
