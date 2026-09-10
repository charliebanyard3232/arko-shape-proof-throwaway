// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen6221Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 3884 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 9833 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 8029 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 5304 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 3809 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 9676 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 7005 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 6574 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 4914 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 8323 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 170 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 2753 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 5487 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 99 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 5400 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 6903 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 4552 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount17() { return 5117 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 9817 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 2594 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold20() { return 6169 }
    /** Derived accessor for reference (generated filler). */
    def computeReference21() { return 2902 }
    /** Derived accessor for version (generated filler). */
    def computeVersion22() { return 795 }
}
