package cc.mrcwm.febs.common.function;

import cc.mrcwm.febs.common.exception.RedisConnectException;

/**
 * @author mrcwm
 */
@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
