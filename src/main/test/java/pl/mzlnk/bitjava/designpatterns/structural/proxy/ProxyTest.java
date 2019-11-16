package pl.mzlnk.bitjava.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {


    @Test
    void test() throws Exception {
        CommandExecutor executor = new CommandExecutorProxy("user", "passwd");

        executor.runCommand("cmd");
    }

}