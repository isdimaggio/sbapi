package it.schoolboard.sbapi.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareMockImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("mock_user");
    }

}
