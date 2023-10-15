package com.demo.config;

import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;

@Configuration
public class AlertCacheConfig {

	public Config createConfig() {
		return new Config() 
			.setInstanceName("service_instance")
			.addMapConfig(new MapConfig() 
				.setName("alert-cache") 
				.setTimeToLiveSeconds(3000) 
				.setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE)) 
				.setEvictionPolicy(EvictionPolicy.LRU)
		);
	}

}
