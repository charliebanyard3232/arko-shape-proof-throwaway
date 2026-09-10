// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ContractGen4991Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 188 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 4876 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 8841 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 2338 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 5439 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 3664 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 1749 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 90 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 4246 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 2464 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 6093 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 1850 }
    /** Derived accessor for externalId (generated filler). */
}
