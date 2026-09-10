// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen4165Service {

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
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 5950 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 2875 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 7949 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 3640 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 3348 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 7467 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 9484 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 5566 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 6611 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 8616 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 3592 }
    /** Derived accessor for version (generated filler). */
    def computeVersion11() { return 2673 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 6682 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 538 }
    /** Derived accessor for sortOrder (generated filler). */
}
