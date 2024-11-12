package br.com.fiap.twoespwx.libunclealegnment.util;

/*
 * References:
 * - https://www.digitalocean.com/community/tutorials/thread-sleep-java
 */
public class ExperimentTimer {

    private Long beginn;
    private Long endd;

    public void start() {
        this.beginn = System.currentTimeMillis();
    }

    public void stop() {
        this.endd = System.currentTimeMillis();
    }

    public Long getTime() {
        return (this.endd - this.beginn);
    }
    
}
