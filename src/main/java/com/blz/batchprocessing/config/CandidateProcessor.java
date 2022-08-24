package com.blz.batchprocessing.config;

import com.blz.batchprocessing.model.Candidate;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<Candidate, Candidate> {
    @Override
    public Candidate process(Candidate candidate) throws Exception {
        return candidate;
    }
}
