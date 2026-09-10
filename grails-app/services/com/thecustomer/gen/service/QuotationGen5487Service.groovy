// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class QuotationGen5487Service {

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
    def computeExternalId0() { return 4584 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 1998 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 1208 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 2877 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 7723 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 8918 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 2010 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 5409 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 8683 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 279 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 8556 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 8895 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 7093 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 1724 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 6234 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 539 }
}
