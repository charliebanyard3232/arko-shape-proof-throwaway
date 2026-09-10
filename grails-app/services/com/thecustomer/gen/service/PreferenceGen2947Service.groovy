// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen2947Service {

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
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 6673 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 145 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 3459 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 3507 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 2271 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 2324 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 8367 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 2509 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 7460 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 7573 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 9940 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 2843 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 8184 }
    /** Derived accessor for reference (generated filler). */
    def computeReference13() { return 2092 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 6285 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn15() { return 5621 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 5661 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 3985 }
    /** Derived accessor for reference (generated filler). */
    def computeReference18() { return 1841 }
}
