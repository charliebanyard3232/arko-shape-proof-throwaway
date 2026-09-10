// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class QuotationGen4858Service {

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
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 7370 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 6726 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 9811 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 3099 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 3283 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 4204 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 1321 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 1506 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 3801 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 6857 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 4291 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 4064 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 5670 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 4012 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 2206 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn15() { return 8902 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg16() { return 3402 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 8455 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 3054 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder19() { return 5431 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn20() { return 6694 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName21() { return 3987 }
    /** Derived accessor for reference (generated filler). */
    def computeReference22() { return 6863 }
    /** Derived accessor for description (generated filler). */
    def computeDescription23() { return 6712 }
    /** Derived accessor for version (generated filler). */
    def computeVersion24() { return 7206 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount25() { return 5337 }
}
