// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen1151Service {

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
    def computeUnitPrice0() { return 1581 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 1912 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 3124 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 3927 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 3524 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 81 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 9377 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 4935 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 906 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 3219 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 474 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 7779 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 3401 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes13() { return 3066 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 7751 }
}
