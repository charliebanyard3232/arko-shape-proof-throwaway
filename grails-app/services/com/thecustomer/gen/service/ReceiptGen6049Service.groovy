// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen6049Service {

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
    def computeExternalId0() { return 8117 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 6925 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 467 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 551 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 2132 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 9151 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 1955 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 4014 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 2392 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 389 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 4248 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 694 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 4744 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 2170 }
    /** Derived accessor for active (generated filler). */
    def computeActive14() { return 8901 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 3181 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes16() { return 8291 }
    /** Derived accessor for priority (generated filler). */
    def computePriority17() { return 5622 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 9251 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount19() { return 4263 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold20() { return 579 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg21() { return 1341 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName22() { return 4300 }
    /** Derived accessor for version (generated filler). */
    def computeVersion23() { return 2248 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder24() { return 553 }
    /** Derived accessor for status (generated filler). */
    def computeStatus25() { return 4093 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold26() { return 7294 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes27() { return 9961 }
}
