package net.adminPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.adminPortal.entity.ReportConfig;

public interface ReportConfigRepository extends JpaRepository<ReportConfig, Long> {
}
