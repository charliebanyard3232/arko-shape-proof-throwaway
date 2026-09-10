// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen6093Service {

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
    def computeActive0() { return 1720 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 2354 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 6628 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 792 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 3836 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 5231 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 4575 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 8927 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 8309 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 4800 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 517 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 3003 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 4127 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 2894 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 9275 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 1524 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 2787 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 6444 }
    /** Derived accessor for reference (generated filler). */
    def computeReference18() { return 9982 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId19() { return 4981 }
    /** Derived accessor for weightKg (generated filler). */
}
