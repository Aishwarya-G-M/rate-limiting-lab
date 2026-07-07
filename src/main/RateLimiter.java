package main;

public interface RateLimiterI {
    boolean allow(String key, Instant now);
}
