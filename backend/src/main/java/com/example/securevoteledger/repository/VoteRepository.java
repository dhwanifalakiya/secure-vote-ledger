package com.example.securevoteledger.repository;

import com.example.securevoteledger.entity.VoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteRecord, Long> {
}
