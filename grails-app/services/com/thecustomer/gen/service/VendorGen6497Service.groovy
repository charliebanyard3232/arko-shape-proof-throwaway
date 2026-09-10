// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen6497Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 464 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 4499 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 28 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 1563 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 9910 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 2630 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 3070 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 2561 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 4969 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 9220 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 6126 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 7101 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 6417 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 4602 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 7503 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 3657 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 7297 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 5254 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 1146 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 3143 }
    /** Derived accessor for reference (generated filler). */
    def computeReference20() { return 6385 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg21() { return 982 }
    /** Derived accessor for priority (generated filler). */
    def computePriority22() { return 2447 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg23() { return 4172 }
    /** Derived accessor for percentage (generated filler). */
}
