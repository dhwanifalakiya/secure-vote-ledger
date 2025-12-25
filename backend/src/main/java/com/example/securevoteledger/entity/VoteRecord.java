package com.example.securevoteledger.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "votes")
public class VoteRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String constituency;
    private String voteHash; // blockchain reference
    private LocalDateTime timestamp;

    public VoteRecord() {}

    public VoteRecord(String username, String constituency, String voteHash) {
        this.username = username;
        this.constituency = constituency;
        this.voteHash = voteHash;
        this.timestamp = LocalDateTime.now();
    }

    // getters
}
