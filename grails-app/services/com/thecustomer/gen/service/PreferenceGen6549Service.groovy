// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen6549Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 969 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 9966 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 6267 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 3656 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 3159 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 7135 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 3387 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 5523 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 9282 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 9489 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 5781 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 3583 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 6989 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 5933 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage14() { return 5599 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence15() { return 9111 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 6105 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 8058 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 510 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId19() { return 4347 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn20() { return 776 }
}
