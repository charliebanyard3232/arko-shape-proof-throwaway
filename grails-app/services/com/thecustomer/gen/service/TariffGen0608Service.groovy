// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen0608Service {

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
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 1950 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 1863 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 2127 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 1706 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 9210 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 8512 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 8839 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 9415 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 8119 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 8340 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 6200 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 5037 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 1005 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 4857 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 7584 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 1832 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 5051 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 1836 }
}
