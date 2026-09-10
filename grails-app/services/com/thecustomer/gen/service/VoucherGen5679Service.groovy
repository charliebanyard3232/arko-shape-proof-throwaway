// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen5679Service {

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
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 2804 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 4059 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 2280 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 3432 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 2583 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 5881 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 7176 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 4739 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 9273 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 8620 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 9810 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 6698 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName12() { return 7529 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 6093 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 7548 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 7154 }
}
