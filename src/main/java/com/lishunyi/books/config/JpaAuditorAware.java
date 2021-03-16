package com.lishunyi.books.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * JPA当前操作人拓展.
 * 起始类加上`@EnableJpaAuditing`
 * 基类加上`@EntityListeners(AuditingEntityListener.class)`
 *
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/16 15:34
 **/
@Configuration
public class JpaAuditorAware implements AuditorAware<Long> {

    /**
     * 返回当前操作人员.
     * 建议从Security之类权限管理拿
     *
     * @return 操作人员
     */
    @Override
    public Optional<Long> getCurrentAuditor() {
        // 先写死为1
        return Optional.of(1L);
    }
}
