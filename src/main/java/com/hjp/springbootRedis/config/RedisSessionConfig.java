package com.hjp.springbootRedis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Redis 配置类
 * @author siit
 *
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
