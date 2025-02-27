package com.nepxion.discovery.plugin.strategy.gateway.filter;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.strategy.context.StrategyContextHolder;

public class DefaultGatewayStrategyRouteFilter extends AbstractGatewayStrategyRouteFilter {
    @Autowired
    protected StrategyContextHolder strategyContextHolder;

    @Override
    public String getRouteVersion() {
        return strategyContextHolder.getRouteVersion();
    }

    @Override
    public String getRouteRegion() {
        return strategyContextHolder.getRouteRegion();
    }

    @Override
    public String getRouteAddress() {
        return strategyContextHolder.getRouteAddress();
    }

    @Override
    public String getRouteVersionWeight() {
        return strategyContextHolder.getRouteVersionWeight();
    }

    @Override
    public String getRouteRegionWeight() {
        return strategyContextHolder.getRouteRegionWeight();
    }

    @Override
    public String getRouteIdBlacklist() {
        return strategyContextHolder.getRouteIdBlacklist();
    }

    @Override
    public String getRouteAddressBlacklist() {
        return strategyContextHolder.getRouteAddressBlacklist();
    }

    public StrategyContextHolder getStrategyContextHolder() {
        return strategyContextHolder;
    }
}